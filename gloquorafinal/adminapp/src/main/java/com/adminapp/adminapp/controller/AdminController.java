package com.adminapp.adminapp.controller;

import com.adminapp.adminapp.model.GloQuora_Post;
import com.adminapp.adminapp.model.UserDetails;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class AdminController {
    private final RestTemplate restTemplate = new RestTemplate();
    ObjectMapper mapper = new ObjectMapper();
    ResponseEntity<ArrayList> response = restTemplate.getForEntity("http://localhost:9192/all", ArrayList.class);
    List<GloQuora_Post> driverlocationsList = mapper.convertValue(response.getBody(), new TypeReference<>() {
    });
    ResponseEntity<ArrayList> epic1 = restTemplate.getForEntity("http://localhost:9191/all", ArrayList.class);
    List<UserDetails> allUserDetails = mapper.convertValue(epic1.getBody(), new TypeReference<>() {
    });

    @GetMapping("/userspost/{id}")
    public ResponseEntity<?> getAllPostsById(@PathVariable int id) {

        System.out.println(driverlocationsList);
        List<GloQuora_Post> getAllPostsById = driverlocationsList.stream().filter(i -> i.getUserId() == id).collect(Collectors.toList());
        System.out.println("-------------<>" + getAllPostsById);

        return new ResponseEntity<>(getAllPostsById, HttpStatus.ACCEPTED);
    }

    @GetMapping("/allpost")
    public ResponseEntity<?> getAllPosts() {

        return new ResponseEntity<>(driverlocationsList, HttpStatus.ACCEPTED);
    }

    @GetMapping("/post/{n}")
    public ResponseEntity<?> postGreterN(@PathVariable int n) {
        List<GloQuora_Post> gloQuoraPosts = driverlocationsList;
        Collections.sort(gloQuoraPosts, (o1, o2) -> (o1.getUserId() > o2.getUserId()) ? -1 : (o1.getUserId() < o2.getUserId()) ? 1 : 0);

        Map<Integer, Integer> total = new HashMap<>();
        int count = 0;
        int first = gloQuoraPosts.get(0).getUserId();

        for (GloQuora_Post gloQuoraPost : gloQuoraPosts) {
            if (gloQuoraPost.getUserId() == first) {
                count++;

            } else {
                total.put(first, count);
                first = gloQuoraPost.getUserId();
                count = 1;
            }
        }
        total.put(first, count);
        List<String> finalList = new ArrayList<>();
        total.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " <><>" + entry.getValue());
            System.out.println(total.size());
            System.out.println(n + " " + entry.getValue());
            if (n <= entry.getValue()) {
                finalList.add(allUserDetails.stream().filter(u -> u.getUserId() == entry.getKey()).map(e -> e.getName()).findAny().orElse(null));
            }

        });

        System.out.println(allUserDetails);

        return new ResponseEntity<>(finalList, HttpStatus.ACCEPTED);
    }

    @GetMapping("/getOnePosted")
    public ResponseEntity<?> postGreterN() {
        List<GloQuora_Post> gloQuoraPosts = driverlocationsList;
    List<Integer> userMoreThenOneOrMorePosts = gloQuoraPosts.stream()
            .map(u -> u.getUserId()).collect(Collectors.toList());
    Set<Integer> finalIds = new HashSet<>(userMoreThenOneOrMorePosts);
    List<String> companyNames = new ArrayList<>();
    for(int a:finalIds){
        System.out.println(a);
        companyNames.add(allUserDetails.stream().filter(u->u.getUserId()==a)
                .map(u->u.getCompany().getName()).findAny().get());
    }
        return new ResponseEntity<>(companyNames, HttpStatus.ACCEPTED);

    }

}
