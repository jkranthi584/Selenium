package guruSelenium;

import org.testng.ITestContext;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.Collections;

public class Practice {
    public static void main(String[] args) {
        for (String each : new String[]{"A", "B"}) {
            runWith(each);
        }
    }

    private static void runWith(String group) {
        TestNG testNG = new TestNG();
        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setName("suite");
        XmlTest xmlTest = new XmlTest(xmlSuite);
        xmlTest.setName("test");
        xmlTest.addIncludedGroup(group);
        XmlClass clazz = new XmlClass(Practice.class);
        clazz.loadClasses();
        xmlTest.getClasses().add(clazz);
        testNG.setXmlSuites(Collections.singletonList(xmlSuite));
        System.out.println(xmlSuite.toXml());
        testNG.run();
    }

    @Test(dataProvider = "SearchProvider", groups = "A")
    public void testMethodA(String author, String searchKey) {
        System.out.println("testMethodA :" + author + ", " + searchKey);
    }

    @Test(dataProvider = "SearchProvider", groups = "B")
    public void testMethodB(String searchKey) {
        System.out.println("testMethodB :" + searchKey);
    }

    @DataProvider(name = "SearchProvider")
    public Object[][] getDataFromDataprovider(ITestContext c) {
        Object[][] groupArray = null;
        for (String group : c.getIncludedGroups()) {
            if (group.equalsIgnoreCase("A")) {
                groupArray = new Object[][]{
                        {"Guru99", "India"},
                        {"Krishna", "UK"},
                        {"Bhupesh", "USA"}
                };
                break;
            } else if (group.equalsIgnoreCase("B")) {
                groupArray = new Object[][]{
                        {"Canada"},
                        {"Russia"},
                        {"Japan"}
                };
            }
            break;
        }
        //return groupArray;
        return groupArray;

    }
}
