import org.junit.*;

public class AttorneyTest {

    @Test
    public void testSetFullName(){
        Attorney attr = new Attorney();
        attr.setFullName("Brian Sam");
        Assert.assertEquals("Brian Sam", attr.getFullName());
    }

    @Test
    public void testGetFullName(){
        Attorney attr = new Attorney();
        attr.setFullName("Matt Louis");
        Assert.assertEquals("Matt Louis", attr.getFullName());
    }
	
    @Test
    public void testSetBarID(){
        Attorney attr = new Attorney();
        attr.setBarID("A12345");
        Assert.assertEquals("A12345", attr.getBarID());
    }

    @Test
    public void testGetBarID(){
	Attorney attr = new Attorney();
        attr.setBarID("1234");
        Assert.assertEquals("1234", attr.getBarID());
    }
	
    @Test
    public void testSetState(){
        Attorney attr = new Attorney();
        attr.setState("FL");
        Assert.assertEquals("FL", attr.getState());
    }

    @Test
    public void testGetState(){
	Attorney attr = new Attorney();
        attr.setState("VA");
        Assert.assertEquals("VA", attr.getState());
    }
}
