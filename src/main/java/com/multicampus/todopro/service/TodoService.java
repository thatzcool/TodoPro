package com.multicampus.todopro.service;

import com.multicampus.todopro.dto.TodoDTO;
import com.multicampus.todopro.dto.PageRequestDTO;
import com.multicampus.todopro.dto.PageResponseDTO;


public interface TodoService {

    void register(TodoDTO todoDTO);

    //List<TodoDTO> getAll();

    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

    TodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TodoDTO todoDTO);
}

