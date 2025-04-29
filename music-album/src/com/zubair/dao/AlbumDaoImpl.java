package com.zubair.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.zubair.pojo.Album;

public class AlbumDaoImpl implements AlbumDao {
	private List<Album> albums;
	
	public AlbumDaoImpl() {
		albums = new ArrayList<Album>();
	}
	
	@Override
	public void save(Album a) {
		albums.add(a);
	}

	@Override
	public List<Album> list() {
		return albums;
	}
	@Override
	public List<Album> findByGenre(String genre) {
	    List<Album> result = new ArrayList<>();
	    for (Album a : albums) {
	        if (a.getGenre().equalsIgnoreCase(genre)) {
	            result.add(a);
	        }
	    }
	    return result;
	}


	@Override
	public Optional<Album> findByTitle(String title) {
		// Use stream to find album
		return albums.stream().filter(a -> a.getTitle().equals(title))
				.findFirst();
	}
	public Optional<Album> findByArtist(String artist) {
		// Use stream to find album
		return albums.stream().filter(a -> a.getArtist().equals(artist))
				.findFirst();
	}
	@Override
	public List<Album> findAlbumsByTitle(String title) {
		List<Album> result = new ArrayList<>();
		for (Album a : list()) {
			if (a.getTitle().equalsIgnoreCase(title)) {
				result.add(a);
			}
		}
		return result;
	}


	@Override
	public void delete(Album a) {
		albums.remove(a);
	}
}



