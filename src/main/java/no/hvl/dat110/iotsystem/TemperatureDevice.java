package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;
import no.hvl.dat110.messages.Message;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		// create a client object and use it to
		
		Client temperatur = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);

		// - connect to the broker - user "sensor" as the user name
		temperatur.connect();
		// - publish the temperature(s)
		for(int i=0; i<COUNT; i++) { 
			int read = sn.read();
		temperatur.publish(Common.TEMPTOPIC, Integer.toString(read));
		}
		// - disconnect from the broker
		temperatur.disconnect(); 
		
		
		// TODO - end

		System.out.println("Temperature device stopping ... ");


	}
}
