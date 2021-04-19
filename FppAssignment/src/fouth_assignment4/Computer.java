package fouth_assignment4;

import java.util.Objects;

public class Computer {
		private String manufacturer;
		private String processor;
		private int ramSize;
		private double processorSpeed;
		
		
		public Computer(String manufacturer,String processor,int ramSize,double processorSpeed) {
			this.manufacturer=manufacturer;
			this.processor=processor;
			this.ramSize=ramSize;
			this.processorSpeed=processorSpeed;
		}
		
		public int getRamSize()
		{
			return this.ramSize;
		}
		public double getProcessorSpeed() {
			return this.processorSpeed;
		}
		public double computePower() 
		{
			return ramSize*processorSpeed;
		}

		
		@Override
		public boolean equals(Object aComputer) {
			
			if(aComputer==null)
			{
				return false;
			}
			/*if(!(aComputer instanceof Computer)) {
				return false;
			}*/
			if(aComputer.getClass()!=this.getClass()) {
				return false;
			}
			
			Computer c1=(Computer)aComputer;
			boolean manufactutrerIsEqual=(this.manufacturer==c1.manufacturer);
			boolean processorIsEqual=(this.processor==c1.processor);
			boolean ramSizeIsEqual=(this.ramSize==c1.ramSize);
			boolean processorSpeed=(Double.doubleToLongBits(this.processorSpeed) == Double.doubleToLongBits(c1.processorSpeed));
			
			
			if(manufactutrerIsEqual && processorIsEqual && ramSizeIsEqual && processorSpeed) {
				return true;
			}else {	
				return false;
			}
		}
		
		@Override
		public int hashCode() {
//			return Objects.hash(manufacturer,professor,ramSize,processorSpeed);
			int hc=7;//initialize with prime number
			
			hc+=manufacturer.hashCode();
			hc+=processor.hashCode();
			hc+=(int)ramSize;
			long processorSpeed1=Double.doubleToLongBits(processorSpeed);
			hc+= (int) (processorSpeed1 ^ (processorSpeed1 >>> 32));			
			return hc;
			
		}
		
		
		
		@Override
		public String toString() {
			return "Manufacturer :"+manufacturer+" Processor :"+processor+"Ram Size :"+ramSize+"Processor Speed :"+processorSpeed;
		}
	
}
