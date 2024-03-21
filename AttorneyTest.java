import org.junit.*;

public class AttorneyTest {

    @Test
    public void testGetFullName(){
        Attorney attr = new Attorney();
        Assert.assertEquals("Matt Louis", attr.getFullName());
	}
	
    @Test
	public void testGetBarID(){
		Attorney attr = new Attorney();
        Assert.assertEquals("1234", attr.getBarID());
	}
	
    @Test
	public void testGetState(){
		Attorney attr = new Attorney();
        Assert.assertEquals("VA", attr.getState());
	}
}
