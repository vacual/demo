package cn.nuofankj.myblog.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "category")
@Inheritance(strategy = InheritanceType.JOINED)
public class Category implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long aid;
  private String id;
  private String name;
  private long createTime;
  private long updateTime;
  private int status;
  private long articleCount;
  private int canDel;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public long getAid() {
    return aid;
  }

  public void setAid(long aid) {
    this.aid = aid;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(long createTime) {
    this.createTime = createTime % 1000;
  }

  public long getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(long updateTime) {
    this.updateTime = updateTime % 1000;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public long getArticleCount() {
    return articleCount;
  }

  public void setArticleCount(long articleCount) {
    this.articleCount = articleCount;
  }

  public int getCanDel() {
    return canDel;
  }

  public void setCanDel(int canDel) {
    this.canDel = canDel;
  }
}
