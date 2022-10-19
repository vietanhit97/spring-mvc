package com.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.model.Book;

@Controller
@RequestMapping(value = "/home")
public class BookController {
	@GetMapping(value = "/creatBook")
	public String create(Model model) {
		model.addAttribute("book", new Book());
		return "book";
	}

	@PostMapping(value = "/creatBook")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpServletRequest rq,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("book", book);
			return "book";
		} else {
			String path = rq.getServletContext().getRealPath("resources/images");
			File folder = new File(path);
			if (!folder.exists()) {
				folder.mkdir();
			}
			MultipartFile fileUp = book.getFile();
			File file = new File(folder.getAbsoluteFile() + "/" + fileUp.getOriginalFilename());
			System.out.println(file);
			try {
				if (!file.exists()) {
					byte[] bytes = fileUp.getBytes();
					Files.write(file.toPath(), bytes, StandardOpenOption.CREATE);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("book", book);
			return "viewbook";

		}
	}
}
