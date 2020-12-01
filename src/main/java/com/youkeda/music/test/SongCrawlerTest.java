package com.youkeda.music.test;

import com.youkeda.music.model.Artist;
import com.youkeda.music.model.Song;
import com.youkeda.music.service.SongCrawlerService;
import com.youkeda.music.service.impl.SongCrawlerServiceImpl;

/**
 * 检查服务是否可以正确返回对象
 */
public class SongCrawlerTest {

  private static final String A_ID = "9270";

  public static void main(String[] args) {
    SongCrawlerService songService = new SongCrawlerServiceImpl();
    songService.start(A_ID);

    System.out.println("歌曲服务运行成功。非常棒！");
    System.exit(0);
  }
}
