package czy.mooc.house.common.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/*
 评论类
 */
@Getter
@Setter
public class Comment {
  
  private Long id;
  private String content;//内容
  private Long   houseId;
  private Date   createTime;
  private Integer blogId;
  private Integer type;//类型
  private Long    userId;
  
  private String  userName;
  private String  avatar;//头像地址

}
