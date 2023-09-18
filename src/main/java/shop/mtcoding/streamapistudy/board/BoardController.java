package shop.mtcoding.streamapistudy.board;

import org.springframework.web.bind.annotation.RestController;

import shop.mtcoding.streamapistudy.user.User;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BoardController {

    @Autowired
    private HttpSession session;

    // 게시글 id, 게시글 제목, 게시글내용, 작성자 아이디, 작성자 유저네임
    // board(id, title, content), user(id, username), isOwner
    @GetMapping("/boards")
    public BoardDetailDTO boardList() {

        // 강제 더미 로그인
        session.setAttribute("sessionUser", User.builder().id(1).username("ssar").build());

        return null;

    }

}
