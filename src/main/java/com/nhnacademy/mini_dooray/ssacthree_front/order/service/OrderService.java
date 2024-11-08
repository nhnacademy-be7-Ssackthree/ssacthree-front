package com.nhnacademy.mini_dooray.ssacthree_front.order.service;

import com.nhnacademy.mini_dooray.ssacthree_front.cart.domain.CartItem;
import com.nhnacademy.mini_dooray.ssacthree_front.order.dto.GuestCartInfoResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
//    GuestCartInfoResponse createGusetOrderSheet(HttpSession httpSessioon);
    List<CartItem> createGusetOrderSheet(HttpSession httpSessioon);
}
