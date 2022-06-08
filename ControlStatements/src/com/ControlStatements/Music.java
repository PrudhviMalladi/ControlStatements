package com.ControlStatements;

public class Music {

	public static void main(String[] args) {
		int songs = 3;
		String MelodySongs;
		switch(songs) {
		case 1:
			MelodySongs = " Vennela";
			break;
		case 2:
			MelodySongs = "Ye Chilipi";
			break;
		case 3:
			MelodySongs = "Hai re hai";
			break;
			default:
				MelodySongs = "Error";
				break;
				
			
		}
		System.out.println(MelodySongs);
		
	}

}
