package id.tugasupl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TentaraTest {
	@Test
	@DisplayName("Gagal Menembak")
	void testGagalMenembak() {
		Tentara tentara = new Tentara();
		Senjata pistol = new Senjata();
		assertEquals("ckckck", tentara.menembak(pistol));
	}
	
	@Test
	@DisplayName("Berhasil Menembak")
	void testBerhasilMenembak() {
		Tentara tentara = new Tentara();
		Senjata pistol = new Senjata();
		pistol.reload(7);
		assertEquals("Dor dor dor", tentara.menembak(pistol));
	}
	
	@ParameterizedTest(name= "{index} => peluruAwal={0}, peluruTersisa ={1}")
	@DisplayName("Cek Peluru")
	@CsvSource({"1,0","2,1","3,2","4,3"})
	void testCekPeluruSetelahMenembak(int peluruAwal, int peluruTersisa) {
		Tentara tentara = new Tentara();
		Senjata pistol = new Senjata();
		pistol.reload(peluruAwal);
		tentara.menembak(pistol);
		assertEquals(peluruTersisa, tentara.hitungPeluru(pistol));
	}
	
}
