package com.merakool.tv_variations.service;

import com.merakool.tv_variations.repository.TvProviderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TvServiceImpl implements TvService{

    private final TvProviderRepository tvProviderRepository;
    // Method to fetch variations for a given TV provider


//        public ApiResponse<TaskResponseDto> createNewTask(TaskRequestDto requestDto, HttpServletRequest request) {
//            HttpSession session = request.getSession();
//            User user = (User) session.getAttribute("user");
//            if (user == null)
//                throw new IllegalStateException("Kindly login to create a tak");
    public List<Object> getProviderBouquets(String provider){

        String uri = "https://api-service.vtpass.com/api/service-variations?serviceID=" + provider;

        RestTemplate restTemplate = new RestTemplate();

        Object[] objects = new Object[] {restTemplate.getForObject(uri, Object.class)};

        return Arrays.asList(objects);
    }

}
