package com.nhnacademy.mini_dooray.ssacthree_front.commons.adapter;

import com.nhnacademy.mini_dooray.ssacthree_front.commons.dto.MessageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="gateway-service",contextId = "tokenReissue",url="${member.url}")
public interface ReissueAdapter {

    @PostMapping("/auth/reissue")
    ResponseEntity<MessageResponse> reissueToken();
}
