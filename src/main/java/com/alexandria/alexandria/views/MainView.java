package com.alexandria.alexandria.views;

import com.alexandria.alexandria.entities.Author;
import com.alexandria.alexandria.entities.Printed;
import com.alexandria.alexandria.services.AuthorPrintedService;
import com.alexandria.alexandria.services.AuthorService;
import com.vaadin.flow.router.Route;
import com.vaadin.ui.TreeGrid;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route("")
public class MainView extends VerticalLayout {
    TreeGrid<Author> grid = new TreeGrid<>(Author.class);
    @Autowired
    AuthorPrintedService authorPrintedService;
    @Autowired
    AuthorService authorService;
    public MainView() {
        List<Author> authors = authorService.getAuthors();
    }

    public List<Printed> getPrintedByAuthor (Author author){
        return authorPrintedService.getPrintedByAuthor(author);
    }
}
