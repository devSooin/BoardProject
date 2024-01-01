package com.sooin.boardback.service;

import org.springframework.http.ResponseEntity;

import com.sooin.boardback.dto.request.board.PostBoardRequestDto;
import com.sooin.boardback.dto.request.board.PostCommentRequestDto;
import com.sooin.boardback.dto.response.board.GetBoardResponseDto;
import com.sooin.boardback.dto.response.board.GetCommentListResponseDto;
import com.sooin.boardback.dto.response.board.GetFavoriteListResponseDto;
import com.sooin.boardback.dto.response.board.PostBoardResponseDto;
import com.sooin.boardback.dto.response.board.PostCommentResponseDto;
import com.sooin.boardback.dto.response.board.PutFavoriteResponseDto;

public interface BoardService {

  ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);

  ResponseEntity<? super GetFavoriteListResponseDto> getFavoriteList(Integer boardNumber);

  ResponseEntity<? super GetCommentListResponseDto> getCommentList(Integer boardNumber);

  ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);

  ResponseEntity<? super PostCommentResponseDto> postComment(PostCommentRequestDto dto, Integer boardNumber, String email);

  ResponseEntity<? super PutFavoriteResponseDto> putFavorite(Integer boardNumber, String email);

  
}
