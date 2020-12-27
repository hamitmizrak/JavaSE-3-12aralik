package com.ecodation.innerclass;

public class Ulke {
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	public class Iller {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		public class Ilce {
			private String ilceAdi;
			
			public String getIlceAdi() {
				return ilceAdi;
			}
			
			public void setIlceAdi(String ilceAdi) {
				this.ilceAdi = ilceAdi;
			}
			
			public class Mahalle {
				private String mahalleAdi;
				
				public String getMahalleAdi() {
					return mahalleAdi;
				}
				
				public void setMahalleAdi(String mahalleAdi) {
					this.mahalleAdi = mahalleAdi;
				}
				
			}
			
		}
	}
}
