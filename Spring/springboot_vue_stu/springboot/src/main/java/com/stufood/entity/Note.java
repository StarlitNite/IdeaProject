package com.stufood.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 评论实体类
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Note {
    private Integer noteId;
    private String noteTitle;
    private String noteMessage;
    private Date noteTime;
}
