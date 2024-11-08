package com.nhnacademy.mini_dooray.ssacthree_front.admin.tag.adapter;


import com.nhnacademy.mini_dooray.ssacthree_front.admin.tag.dto.TagCreateRequest;
import com.nhnacademy.mini_dooray.ssacthree_front.admin.tag.dto.TagGetResponse;
import com.nhnacademy.mini_dooray.ssacthree_front.commons.dto.MessageResponse;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "gateway-service", url = "${admin-client.url}", contextId = "adminTagClient")
public interface TagAdapter {

    @PostMapping("/tags")
    ResponseEntity<MessageResponse> createTag(@RequestBody TagCreateRequest tagCreateRequest);

    @GetMapping("/tags")
    ResponseEntity<List<TagGetResponse>> getAllTags();
}
