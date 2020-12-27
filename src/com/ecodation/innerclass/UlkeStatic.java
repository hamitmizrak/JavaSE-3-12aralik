package com.ecodation.innerclass;

public class UlkeStatic {
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	public static class IllerStatic {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		public static class IlceStatic {
			private String ilceAdi;
			
			public String getIlceAdi() {
				return ilceAdi;
			}
			
			public void setIlceAdi(String ilceAdi) {
				this.ilceAdi = ilceAdi;
			}
			
			public static class MahalleStatic {
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
