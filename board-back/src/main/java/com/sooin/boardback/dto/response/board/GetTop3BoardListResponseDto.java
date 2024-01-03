package com.sooin.boardback.dto.response.board;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sooin.boardback.common.ResponseCode;
import com.sooin.boardback.common.ResponseMessage;
import com.sooin.boardback.dto.object.BoardListItem;
import com.sooin.boardback.dto.response.ResponseDto;
import com.sooin.boardback.entity.BoardListViewEntity;

import lombok.Getter;

@Getter
public class GetTop3BoardListResponseDto extends ResponseDto {

  private List<BoardListItem> top3List;

  private GetTop3BoardListResponseDto(List<BoardListViewEntity> boardListViewEntities) {
    super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    this.top3List = BoardListItem.getList(boardListViewEntities);
  }

  public static ResponseEntity<GetTop3BoardListResponseDto> success(List<BoardListViewEntity> boardListViewEntities) {
    GetTop3BoardListResponseDto result = new GetTop3BoardListResponseDto(boardListViewEntities);
    return ResponseEntity.status(HttpStatus.OK).body(result);
  }
  
}
