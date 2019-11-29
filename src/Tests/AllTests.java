package Tests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses({TestPosition.class, TestBarge.class,TestCaravel.class, TestCarrack.class,TestFleet.class, TestFrigate.class,TestGalleon.class, TestGame.class, })
public class AllTests {

}
