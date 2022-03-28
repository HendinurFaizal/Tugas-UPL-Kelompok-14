package id.tugasupl;

public class Senjata {
    int jumlahPeluru = 0;
    
    public Senjata() {
		
	}
	public boolean tembak(){
		if(jumlahPeluru > 0) {
			this.jumlahPeluru--;
			return true;
		}
		else {
			return false;
		}
    }
	
	public int cekPeluru() {
		return this.jumlahPeluru;
	}
	
    public void reload(int peluru){
        this.jumlahPeluru = peluru;
    }
}
