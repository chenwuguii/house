package czy.mooc.house.biz.mapper;

import java.util.List;

import czy.mooc.house.common.page.PageParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import czy.mooc.house.common.model.Blog;

@Mapper
public interface BlogMapper {

  public List<Blog> selectBlog(@Param("blog")Blog query, @Param("pageParams") PageParams params);

  public Long selectBlogCount(Blog query);

}
