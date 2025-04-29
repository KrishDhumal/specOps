package com.zubair.cli;

import java.util.List;
import java.util.Scanner;

import com.zubair.pojo.Album;
import com.zubair.service.AlbumService;
import com.zubair.service.AlbumServiceImpl;
import com.zubair.service.InvalidAlbumException;

public class AlbumUI {
	private static AlbumService service = new AlbumServiceImpl();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("Main Menu");
			System.out.println("1: Add\n2: List\n3: Find\n4: Delete\n5: Exit");
			System.out.print("Enter Option: ");
			int option = scanner.nextInt();

			switch (option) {
			case 1: addAlbum(); break;
			case 2: listAlbums(); break;
			case 3: findAlbum(); break;
			case 4: delAlbum(); break;
			case 5: System.exit(0);
			default: System.out.println("Invalid option");
			}
		}
	}

	private static void addAlbum() {
//		Album a = new Album();
		System.out.print("Enter Title: ");
		String title = scanner.next();
//		a.setTitle(title);
		System.out.print("Enter Artist: ");
		String artist = scanner.next();
//		a.setArtist(artist);
		System.out.print("Enter Genre: "); // Pop|Rock|Jazz
		String genre = scanner.next();
//		a.setGenre(genre);
		System.out.print("Enter Rating: ");
		double rate = scanner.nextDouble();
//		a.setRating(rate);
		Album a = new Album(title, artist, genre, rate);
		service.save(a);
	}

	private static void findAlbum() {
	    System.out.print("Select Genre: ");
	    String genre = scanner.next();
	    try {
	        List<Album> albumsByGenre = service.findByGenre(genre);
	        System.out.println("Albums in genre '" + genre + "':");
	        for (Album album : albumsByGenre) {
	            System.out.println(album.getTitle());
	        }

	        System.out.print("Enter Title: ");
	        String title = scanner.next();
	        List<Album> albums = service.findAlbumsByTitle(title);
	        if (albums.isEmpty()) {
	            throw new InvalidAlbumException("No album found with title: " + title);
	        }

	        System.out.println("Title: " + title);
	        System.out.print("Artists with this title: ");
	        for (Album a : albums) {
	            System.out.print(a.getArtist() + "  ");
	        }
	        System.out.println();

	        System.out.print("Enter Artist Name: ");
	        String artist = scanner.next();
	        try {
	            Album a = service.findByArtist(artist);
	            System.out.println(a);
	        } catch (InvalidAlbumException e) {
	            System.out.println(e.getMessage());
	        }

	    } catch (InvalidAlbumException e) {
	        System.out.println(e.getMessage());
	    }
	}




	private static void listAlbums() {
		List<Album> albums = service.list();
		for(Album a : albums)
			System.out.println(a);
	}

	private static void delAlbum() {
		System.out.print("Enter Title: ");
		String title = scanner.next();
		try {
			service.delete(title);
		} catch (InvalidAlbumException e) {
			System.out.println(e.getMessage());
		}
	}
}


