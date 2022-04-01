package peaksoft.informationprojekt.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.informationprojekt.entity.User;
import peaksoft.informationprojekt.repository.UserRepository;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
public class UserApi {

    private final UserRepository userRepository;

    //save
    @PostMapping("/save")
    public User save(@RequestBody User user){
        return  userRepository.save(user);
    }
    //findById
    @GetMapping("/{id}")
    public  User findById(@PathVariable Long id){
        return userRepository.findById(id).get();
    }
//    @PutMapping("/{id}")
//    public User update(@PathVariable Long id,@RequestBody User user){
//        return userRepository.
//    }
    //delete
//    @DeleteMapping("/{id}")
//    public User deleteById(@PathVariable Long id){
//        return userRepository.deleteById(id);
//    }
    //getAll



}
