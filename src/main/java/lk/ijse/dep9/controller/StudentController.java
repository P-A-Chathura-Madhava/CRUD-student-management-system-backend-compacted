package lk.ijse.dep9.controller;

import lk.ijse.dep9.dto.ResponseDTO;
import lk.ijse.dep9.dto.StudentDTO;
import lk.ijse.dep9.service.StudentService;
import lk.ijse.dep9.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private ResponseDTO responseDTO;

    @PostMapping(value = "/saveStudent")
    public /*ResponseEntity*/String saveStudent(@RequestBody StudentDTO studentDTO){
//        try {
            String res=studentService.saveStudent(studentDTO);
//            if (res.equals("00")){
//                responseDTO.setCode(VarList.RSP_SUCCESS);
//                responseDTO.setMessage("Success");
//                responseDTO.setContent(studentDTO);
//                return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
//            }else if(res.equals("06")) {
//                responseDTO.setCode(VarList.RSP_DUPLICATED);
//                responseDTO.setMessage("Student Registered");
//                responseDTO.setContent(studentDTO);
//                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);
//            }else {
//                responseDTO.setCode(VarList.RSP_FAIL);
//                responseDTO.setMessage("Error");
//                responseDTO.setContent(null);
//                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);
//            }
//        }catch (Exception ex){
//            responseDTO.setCode(VarList.RSP_ERROR);
//            responseDTO.setMessage(ex.getMessage());
//            responseDTO.setContent(null);
//            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
        return res;
    }

    @PutMapping(value = "/updateStudent/{studentId}")
    public /*ResponseEntity*/String updateStudent(@RequestBody StudentDTO studentDTO, @PathVariable int studentId){
        System.out.println("Working!!!!!!!!!!!!!!!!!!");
        studentDTO.setId(studentId);
//        try {
            String res=studentService.updateStudent(studentDTO);
//            if (res.equals("00")){
//                responseDTO.setCode(VarList.RSP_SUCCESS);
//                responseDTO.setMessage("Success");
//                responseDTO.setContent(studentDTO);
//                return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
//
//            }else if(res.equals("01")) {
//                responseDTO.setCode(VarList.RSP_DUPLICATED);
//                responseDTO.setMessage("Not A Registered Student");
//                responseDTO.setContent(studentDTO);
//                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);
//            }else {
//                responseDTO.setCode(VarList.RSP_FAIL);
//                responseDTO.setMessage("Error");
//                responseDTO.setContent(null);
//                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);
//            }
//
//        }catch (Exception ex){
//            responseDTO.setCode(VarList.RSP_ERROR);
//            responseDTO.setMessage(ex.getMessage());
//            responseDTO.setContent(null);
//            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
        return res;
    }

    @GetMapping("/getAllStudents")
    public /*ResponseEntity*/List<StudentDTO> getAllStudents(){
//        try {
            List<StudentDTO> studentDTOList = studentService.getAllStudent();
//            responseDTO.setCode(VarList.RSP_SUCCESS);
//            responseDTO.setMessage("Success");
//            responseDTO.setContent(studentDTOList);
//            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
//
//        }catch (Exception ex){
//            responseDTO.setCode(VarList.RSP_ERROR);
//            responseDTO.setMessage(ex.getMessage());
//            responseDTO.setContent(null);
//            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
        return studentDTOList;
    }

    @DeleteMapping("/deleteStudent/{id}")
    public /*ResponseEntity*/String deleteStudent(@PathVariable int id){
//        try {
            String res = studentService.deleteStudent(id);
//            if (res.equals("00")) {
//                responseDTO.setCode(VarList.RSP_SUCCESS);
//                responseDTO.setMessage("Success");
//                responseDTO.setContent(null);
//                return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
//            } else {
//                responseDTO.setCode(VarList.RSP_NO_DATA_FOUND);
//                responseDTO.setMessage("No Student Available For this id");
//                responseDTO.setContent(null);
//                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);
//            }
//        } catch (Exception e) {
//            responseDTO.setCode(VarList.RSP_ERROR);
//            responseDTO.setMessage(e.getMessage());
//            responseDTO.setContent(e);
//            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
        return res;
    }

    @GetMapping("/searchStudent/{studentId}")
    public /*ResponseEntity*/StudentDTO searchStudent(@PathVariable int studentId){
//        try {
            StudentDTO studentDTO = studentService.searchStudent(studentId);
//            if (studentDTO != null) {
//                responseDTO.setCode(VarList.RSP_SUCCESS);
//                responseDTO.setMessage("Success");
//                responseDTO.setContent(studentDTO);
//                return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
//            } else {
//                responseDTO.setCode(VarList.RSP_NO_DATA_FOUND);
//                responseDTO.setMessage("No Student Available For this id");
//                responseDTO.setContent(null);
//                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);
//            }
//        } catch (Exception e) {
//            responseDTO.setCode(VarList.RSP_ERROR);
//            responseDTO.setMessage(e.getMessage());
//            responseDTO.setContent(e);
//            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
        return studentDTO;
    }
}
