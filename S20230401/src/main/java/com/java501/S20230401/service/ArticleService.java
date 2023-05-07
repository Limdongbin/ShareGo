package com.java501.S20230401.service;

import java.util.List;

import com.java501.S20230401.model.Comm;
import com.java501.S20230401.model.Region;
import com.java501.S20230401.model.Waiting;
import com.java501.S20230401.model.Article;
import com.java501.S20230401.model.Comm;
import com.java501.S20230401.model.Region;
import com.java501.S20230401.model.ArticleMember;
import com.java501.S20230401.model.MemberInfo;
import com.java501.S20230401.util.SummaryType;

public interface ArticleService {
	// 유현규 로그인
	public List<ArticleMember> getArticleSummary(int boardNum, SummaryType summaryType);
	public int insertArticle(Article article);
	public Article getArticleById(Article searcher);
	public MemberInfo getMemberInfoById(int mem_id);
	public ArticleMember getArticleMemberById(Article searcher);

	// 양동균
	int allTotalArt(Article article);
	List<Article> allArticleList(Article article);
	Article detailShareArticle(Article article);	// 댓글
	int readShareArticle(Article article);
	int writeShareArticle(Article article);	// 글쓰기

	// 백준
	Integer 			totalArticle(int brd_id);
	List<Article> 		articleTotal(Article article);
	Article 			detailContent(Article article);
	List<Article>		articleMenu(Article article);
	Integer 			upreadCount(Article article);
	List<Article> 		listMagnager();
	int 				bjWriteArticle(Article article);
	public int 			bjUpdateArticle(Article article);
	public int 			delete(Article article);
	
	// 임동빈
	int 			totalArticle(Article article);
	List<Article> 	dbListArticle(Article article);
	Article 		detailArticle(Article article);
	List<Region> 	regionName();
	List<Region>	parentRegionName();
	List<Comm> 		categoryName();
	List<Comm>		genderName();
	List<Article> 	replyList(Article article);
	void 			dbWriteArticle(Article article);
	void			dbUpdateArticle(Article article);
	int 			deleteArticle(Article article);
	
	// 김찬영
	int				totalArticle();
	List<Article> 	listArticle(Article article);
	Article			cyArticlereadDetail(Article article);
	Article 		cyArticlereadupdate(Article article);
	Article 		detailArticle(int art_title);
	int				cyArticleinsert(Article article);
	int				cyArticlemodify(Article article);
	
	// 최승환
	int 				totalCustomer();
	List<Article> 		listCustomer(Article article);
	Article 			detailCustomer(Article article);
	List<Article> 		listCustomerMenu(Article article);
	public int 			insertCustomer(Article article);
	
	
	// 김진현
	List<Article> 			getDutchpayList(String boardName);//진현
	Article                 detail1(Article article);
	public List<Article> 	repList1(Article article);
	public List<Comm>		payStatus1();
	public Article 			payStatusPro1(Article article);
//	public Article          replyInsert1(Article article);
	List<Comm> 				category1();
	List<Region>         	loc1();
	void 					dutchpayInsert1(Article article);
	Article		 			updateForm1(Article article);
	List<Region> 			loc_ud1();
	public void 			dutchpayUpdate1(Article article);
	public void 			dutchpayDelete1(Article article);
	public int 				DeatilRead1(Article article);
	public int 				totalArticle1();
	void 			        applyInsert1(Article article);
	public Article 			applyCancel1(Article article);
	public Article			joinCancel1(Article article);
	public List<Article>    joinList1(Article article);
	public List<Article>    waitList1(Article article);
	public Article 			joinDeny1(Article article);
	public Article          joinAccept1(Article article);
	public int              payCompleted1(int trd_id);

	
	
	
}