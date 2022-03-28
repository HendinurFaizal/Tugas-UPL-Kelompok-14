package id.tugasupl;

public class Tentara {
	public Tentara() {
		
	}
	
	public String menembak(Senjata pistol){
        return pistol.tembak()? "Dor dor dor":"ckckck";
    }
	
	public int hitungPeluru(Senjata pistol) {
		return pistol.cekPeluru();
	}
}
