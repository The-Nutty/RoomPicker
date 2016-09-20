package com.tomhazell.roompicker.controller;

import com.tomhazell.roompicker.GenericError;
import com.tomhazell.roompicker.RoomForm;
import com.tomhazell.roompicker.database.Room;
import com.tomhazell.roompicker.database.RoomRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Random;

/**
 * Created by Tom Hazell on 20/09/2016.
 */
@Controller
public class RoomController {

    @Autowired
    private RoomRespository roomRespository;

    @RequestMapping("/")
    public ModelAndView getNewRoom(Model model, RoomForm roomForm){
        return new ModelAndView("new_room");
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView postNewRoom(Model model, RoomForm roomForm, BindingResult bindingResult, HttpServletRequest request){
        if (bindingResult.hasErrors()){
            throw new GenericError();
        }

        Random random = new Random();

        Room room = new Room();
        room.setIP(request.getRemoteAddr());
        room.setName(roomForm.getName());
        room.setRandomNum(random.nextInt());

        roomRespository.save(room);
        model.addAttribute("done", "done");
        return new ModelAndView("new_room");
    }

    @RequestMapping("/rooms")
    public ModelAndView getAllRooms(Model model){
        List<Room> all = roomRespository.findAll();
        model.addAttribute("rows", all);
        return new ModelAndView("all_rooms");
    }
}
