package Tests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses({PositionTest.class, BargeTest.class,CaravelTest.class, CarrackTest.class,FleetTest.class, FrigateTest.class,GalleonTest.class, GameTest.class})  
public class AllTests {

}
