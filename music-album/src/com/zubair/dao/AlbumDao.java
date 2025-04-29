package com.zubair.dao;

import java.util.List;
import java.util.Optional;

import com.zubair.pojo.Album;

public interface AlbumDao {

	void save(Album a);
	
	List<Album> list();
	
	Optional<Album> findByTitle(String title);
	Optional<Album> findByArtist(String artist);
	List<Album> findAlbumsByTitle(String title);
	List<Album> findByGenre(String genre);
	
	void delete(Album a);
}
