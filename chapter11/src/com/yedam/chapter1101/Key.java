package com.yedam.chapter1101;

public class Key {
	
		public int number;
		private String id;
		
		public Key (int number) {
			this.number=number;
		}
		
		@Override
		public boolean equals (Object obj) {
			if (obj instanceof Key) {
				Key comparekey = (Key)obj;
				if(this.number == comparekey.number)
					return true;
			}
			return false;
		}
		

		@Override
		public String toString() {
			return "Member [id=" + id + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5 + ", id6=" + id6
					+ ", id7=" + id7 + "]";
		}
}
