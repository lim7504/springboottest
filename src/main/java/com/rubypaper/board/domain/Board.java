package com.rubypaper.board.domain;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.sql.Update;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString(exclude = "member")
@Entity
@TableGenerator(name = "BOARD_SEQ_GENERATOR"
                ,table = "ALL_SEQUENCES"
                ,pkColumnValue = "BOARD_SEQ"
                ,initialValue = 0
                ,allocationSize = 1)
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "BOARD_SEQ_GENERATOR")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;

    private String title;

    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date createDate = new Date();

    @Column(updatable = false)
    private Long cnt = 0L;

    @ManyToOne
    @JoinColumn(name="MEMBER_ID", nullable=false, updatable = false)
    private Member member;

    public void setMember(Member member){
        this.member = member;
        member.getBoardList().add(this);
    }
}

