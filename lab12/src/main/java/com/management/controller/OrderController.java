package com.management.controller;


import com.management.entity.Order;
import com.management.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping()
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping(path = "/orders/add", method = RequestMethod.GET)
    public String createOrder(Model model) {
        model.addAttribute("order", new Order());
        return "add_order";
    }

    @RequestMapping(path = "/orders/add", method = RequestMethod.POST)
    public String createOrders(Model model) {
        model.addAttribute("order", new Order());
        return "add_order";
    }

    @RequestMapping(path = "orders", method = RequestMethod.POST)
    public String saveOrder(Order order) {
        orderRepository.save(order);
        return "redirect:/orders";
    }

    @RequestMapping(path = "/orders", method = RequestMethod.GET)
    public String getAllOrders(Model model) {
        model.addAttribute("orders", orderRepository.findAll());
        return "orders";
    }

    @RequestMapping(path = "/orders/edit/{id}", method = RequestMethod.GET)
    public String editOrder(Model model, @PathVariable(value = "id") String id) {
        model.addAttribute("order", orderRepository.getOne(Long.valueOf(id)));
        return "edit_order";
    }

    @RequestMapping(path = "/orders/delete/{id}", method = RequestMethod.GET)
    public String deleteOrder(@PathVariable(name = "id") String id) {
        orderRepository.deleteById(Long.valueOf(id));
        return "redirect:/orders";
    }
}
