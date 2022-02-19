package com.org.ita.kata;

import com.org.ita.DataProviderUserImplementation;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SixTest extends DataProviderUserImplementation {

    @DataProvider(name = "RainfallDP")
    public Object[][] RainfallDP() {
        Object[][] parameters = new Object[][] {
                {"London", "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5," +
                        "Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" + "\n", 51.199999999999996},
                {"Beijing", "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3," +
                        "Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" + "\n", 52.416666666666664},
                {"Madrid", "" + "\n", -1.0},
                {"Berlin", "" + "\n", -1.0}
        };

        return combine(implementationsSixKataDataProvider(), parameters);
    }

    @DataProvider(name = "FindNbDP")
    public Object[][] FindNbData() {
        Object[][] parameters = new Object[][]{
                {2022, 4183059834009L},
                {-1, 24723578342962L},
                {4824, 135440716410000L},
                {3568, 40539911473216L},
        };
        return combine(implementationsSixKataDataProvider(), parameters);
    }

    @Test(dataProvider = "FindNbDP")
    public void testFindNb(Six six, long expected, long data) {
        long actual = six.findNb(data);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "balanceDP")
    public Object[][] balanceDP() {
        Object[][] parameters = new Object[][]{
                {"1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10",
                        "Original Balance: 1000.00\\r\\n125 Market 125.45 Balance 874.55\\r\\n126 Hardware 34.95 Balance 839.60\\r\\n127 Video 7.45 Balance 832.15\\r\\n128 Book 14.32 Balance 817.83\\r\\n129 Gasoline 16.10 Balance 801.73\\r\\nTotal expense  198.27\\r\\nAverage expense  39.65"},
                {"1233.00\n125 Hardware;! 24.80?\n123 Flowers 93.50;\n127 Meat 120.90\n120 Picture 34.00\n124 Gasoline 11.00\n123 Photos;! 71.40?\n122 Picture 93.50\n132 Tyres;! 19.00,?;\n129 Stamps; 13.60\n129 Fruits{} 17.60\n129 Market;! 128.00?\n121 Gasoline;! 13.60?",
                        "Original Balance: 1233.00\\r\\n125 Hardware 24.80 Balance 1208.20\\r\\n123 Flowers 93.50 Balance 1114.70\\r\\n127 Meat 120.90 Balance 993.80\\r\\n120 Picture 34.00 Balance 959.80\\r\\n124 Gasoline 11.00 Balance 948.80\\r\\n123 Photos 71.40 Balance 877.40\\r\\n122 Picture 93.50 Balance 783.90\\r\\n132 Tyres 19.00 Balance 764.90\\r\\n129 Stamps 13.60 Balance 751.30\\r\\n129 Fruits 17.60 Balance 733.70\\r\\n129 Market 128.00 Balance 605.70\\r\\n121 Gasoline 13.60 Balance 592.10\\r\\nTotal expense  640.90\\r\\nAverage expense  53.41"}
        };
        return combine(implementationsSixKataDataProvider(), parameters);
    }

    @Test(dataProvider = "balanceDP")
    public void testBalance(Six six, String book, String expected) {
        String actual = six.balance(book);
        assertEquals(actual, expected);
    }

    @Test
    public void testF() {
    }

    @Test(dataProvider = "RainfallDP")
    public void testMean(Six six, String town, String data, double expected) {
        double actual = six.mean(town, data);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "RainfallDP")
    public void testVariance(Six six, String town, String data, double expected) {
        double actual = six.mean(town, data);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "NbaCupDP")
    public Object[][] nbaCupTestData() {
        String resultSheet1 = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
                + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
                + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
                + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
                + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
                + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
                + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 97,";
        String resultSheet2 = "San Antonio Spurs 111 Houston Rockets 86,Chicago Bulls 103 Dallas Mavericks 102,Minnesota Timberwolves 112 Milwaukee Bucks 108,"
                + "New Orleans Pelicans 93 Miami Heat 90,Boston Celtics 81 Philadelphia 76ers 65,Detroit Pistons 115 Atlanta Hawks 87,"
                + "Toronto Raptors 92 Washington Wizards 82,Orlando Magic 86 Memphis Grizzlies 76,Los Angeles Clippers 115 Portland Trail Blazers 109,"
                + "Los Angeles Lakers 97 Golden State Warriors 136,Utah Jazz 98 Denver Nuggets 78,Boston Celtics 99 New York Knicks 85,"
                + "Indiana Pacers 98 Charlotte Hornets 86,Dallas Mavericks 87 Phoenix Suns 99,Atlanta Hawks 81 Memphis Grizzlies 82,"
                + "Miami Heat 110 Washington Wizards 105,Detroit Pistons 94 Charlotte Hornets 99,Orlando Magic 110 New Orleans Pelicans 107,"
                + "Los Angeles Clippers 130 Golden State Warriors 95,Utah Jazz 102 Oklahoma City Thunder 113,San Antonio Spurs 84 Phoenix Suns 104,"
                + "Chicago Bulls 103 Indiana Pacers 94,Milwaukee Bucks 106 Minnesota Timberwolves 88,Los Angeles Lakers 104 Portland Trail Blazers 102,"
                + "Houston Rockets 120 New Orleans Pelicans 100,Boston Celtics 111 Brooklyn Nets 105,Charlotte Hornets 94 Chicago Bulls 86,Cleveland Cavaliers 103 Dallas Mavericks 97";
        String resultSheet3 = resultSheet1 + resultSheet2;
        Object[][] parameters = new Object[][]{
                {resultSheet3, "Memphis Grizzlies", "Memphis Grizzlies:W=2;D=0;L=2;Scored=346;Conceded=376;Points=6"},
                {resultSheet3, "", ""},
                {resultSheet3, "Boston Celt", "Boston Celt:This team didn't play!"},
                {resultSheet3, "Oklahoma City Thunder", "Oklahoma City Thunder:W=2;D=0;L=0;Scored=225;Conceded=208;Points=6"}
        };
        return combine(implementationsSixKataDataProvider(), parameters);
    }

    @Test(dataProvider = "NbaCupDP")
    public void testNbaCup(Six six, String resultSheet, String toFind, String expected) {
        System.out.println("Testing data: " + resultSheet + "\n" + toFind);
        System.out.println("Expected: " + expected);
        String actual = six.nbaCup(resultSheet, toFind);
        System.out.println("Actual: " + actual + "\n---");
        assertEquals(actual, expected);
    }

    @DataProvider(name = "Bookseller")
    public Object[][] BooksellerStockSummaryImpl() {
        Object[][] parameters = new Object[][]{
                {new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"},
                        new String[]{"A", "B"},
                        "(A : 200) - (B : 1140)"},
                {new String[]{"ALAR 400", "ZXCV 300", "LKMN 250", "TYRM 650", "TVPE 400"},
                        new String[]{"A", "T"},
                        "(A : 400) - (T : 1050)"},
        };
        return combine(implementationsSixKataDataProvider(), parameters);
    }

    @Test(dataProvider = "Bookseller")
    public void testStockSummary(Six six, String[] art, String[] cd, String expected) {
        assertEquals(six.stockSummary(art, cd), expected);
    }
}