package com.example.blogv2be.model;

import com.example.blogv2be.model.constant.BlogSourceEnum;
import com.example.blogv2be.model.constant.Constant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "blogs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tittle;
    @Length(max = Constant.descriptionMax)
    private String description;
    @Length(max = Constant.urlMax)
    private String thumbnail;
    private String content;
    private String createdDate;
    private String lastUpdatedDate;
    private long view;

    private BlogSourceEnum source;
}
