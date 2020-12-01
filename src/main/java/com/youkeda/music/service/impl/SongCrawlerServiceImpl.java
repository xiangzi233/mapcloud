package com.youkeda.music.service.impl;

import com.alibaba.fastjson.JSON;
import com.youkeda.music.model.Artist;
import com.youkeda.music.model.Song;
import com.youkeda.music.service.SongCrawlerService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongCrawlerServiceImpl implements SongCrawlerService {

  private Map<String, Artist> artists;

  private void init() {
  }

  @Override
  public void start(String artistId) {
    // 执行初始化
    init();

    // 初始化歌曲及歌单
    initArtistHotSongs(artistId);
    assembleSongDetail(artistId);
    assembleSongComment(artistId);
    assembleSongUrl(artistId);
  }

  private void initArtistHotSongs(String artistId) {
  }

  private void assembleSongDetail(String artistId) {

  }

  private void assembleSongComment(String artistId) {

  }

  private void assembleSongUrl(String artistId) {

  }


}