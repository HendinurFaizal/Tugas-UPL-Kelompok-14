package id.tugasupl;

public class Senjata {
	// Atribut 
    int jumlahPeluru = 0;
    
	// Instansiasi
    public Senjata() {
		
	}
	
	//Method
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
