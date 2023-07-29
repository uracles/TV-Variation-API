package com.merakool.tv_variations.controller;

import com.merakool.tv_variations.service.TvService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.springframework.http.HttpStatus.ACCEPTED;

@Data
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/goCash")

public class TvController {
    private final TvService tvService;
    @GetMapping("/{provider}")
//    public List<Object> getTvVariations(@PathVariable String provider) {
    public ResponseEntity<?> getTvVariations(@PathVariable String provider) {
        log.info("it got here");
        return new ResponseEntity<>(tvService.getProviderBouquets(provider), ACCEPTED);
//        return Collections.singletonList(tvService.getProviderBouquets(provider));
        }
    }






//    =============================================================================================


// Object[] objects = (Object[]) restTemplate.getForObject(uri,Object.class);


//    @GetMapping("/tvVariations")
////    public List<Object> getTvVariations(@RequestParam("provider") String provider) {
////        return tvService.getTvVariations(provider);
////    }
//
//    public ResponseEntity<?> viewTvVariations(@RequestParam("provider") String provider) {
//        Object response = tvService.getTvVariations(provider);
//
//        if (response == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        } else {
//            return new ResponseEntity<>(response, HttpStatus.OK);
//        }
//    }



//    @GetMapping("/list/medications")
//    public ResponseEntity<ApiResponse<List<MedicationDto>>> getLoadedMedications(@RequestParam String serialNo) {
//        return ResponseEntity.ok(droneService.checkLoadedMedicationItemsInADrone(serialNo));
//    }
//
//    @GetMapping("/list/available-drones")
//    public ResponseEntity<ApiResponse<List<DroneResponseDto>>> getDrones() {
//        return ResponseEntity.ok(droneService.checkAvailableDronesForLoading());
//    }


