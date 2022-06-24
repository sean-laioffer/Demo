package com.example.demo.controller;

import com.example.demo.model.DataSet;
import com.example.demo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    private SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping(value = "/search")
    public List<DataSet> searchDataSets()  {
        return new ArrayList<>();
    }
}
