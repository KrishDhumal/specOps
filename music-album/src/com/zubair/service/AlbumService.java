package com.zubair.service;

import java.util.List;
import com.zubair.pojo.Album;

public interface AlbumService {

	void save(Album a);
	
	List<Album> list();
	
	Album findByArtist(String artist) throws InvalidAlbumException;
	List<Album> findByTitle(String title) throws InvalidAlbumException;
	List<Album> findAlbumsByTitle(String title) throws InvalidAlbumException;
	List<Album> findByGenre(String genre) throws InvalidAlbumException;


	
	void delete(String title) throws InvalidAlbumException;

	
}
