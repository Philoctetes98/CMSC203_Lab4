/**
 * The purpose of this class is to model a television
 * @author binya
 *
 */

/**
 * This is the class
 */

public class Television {
	private final String manufacturer;     // the name of the television manufacturer
	private final int screen_size;         // the size of the television screen 
	private boolean powerOn;               //whether the television is on or off
	private int channel;                  // the value of the station that the television is showing
	private int volume;                   // a number value representing the loudness (0 being no sound)
	
	/**
	 * Creation of the constructor. The purpose of the constructor
	 * is to initialize all of the different attributes of the television
	 * such as the name of the manufacturer, its initial channel, volume and 
	 * the fact that its off.
	 * @param man
	 * @param screenSize
	 */
	
	public Television(String man, int screenSize)
	{
		this.manufacturer = man;
		this.screen_size = screenSize;
		powerOn = false;
		channel = 2;
		volume = 20;
	}
	
	/**
	 * mutator method which accepts a value to be stored into
	 * the channel field
	 * @param channel
	 */
	
	public void setChannel(int channel)
	{
		this.channel = channel;
	}
	
	/**
	 * mutator method which changes the state from true to false or
	 * from false to true.
	 */
	
	public void power()
	{
		this.powerOn = !powerOn;
	}
	
	/**
	 * mutator method which increases the volume by 1
	 */
	
	public void increaseVolume()
	{
		volume+=1;
	}
	
	/**
	 * mutator method which decreases the volume by 1
	 */
	
	public void decreaseVolume()
	{
		volume-=1;
	}
	
	/**
	 * getter method which returns the volume
	 * @return
	 */
	public int getVolume()
	{
		return volume;
	}
	
	/**
	 * getter method which returns the television channel
	 * @return
	 */
	public int getChannel()
	{
		return channel;
	}
	
	/**
	 * getter method which returns the name of the television manufacturer
	 * @return
	 */
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	/**
	 * getter method which returns the television's screen size
	 * @return
	 */
	public int getScreenSize()
	{
		return screen_size;
	}
}
