import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginUsuario } from 'src/app/Model/login-usuario';
import { AuthService } from 'src/app/service/auth.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
isLogged = false;
islogginFail = false;
loginUsuario= LoginUsuario;
nombreUsuario = "String";
password!: "String";
roles: string[] = [];
errMsg!: string;


  constructor(private tokenService: TokenService, private authService: AuthService, private router: Router) { }

  ngOnInit(): void {
    if(this.tokenService.getToken()){
      this.isLogged = true;
      this.islogginFail = false;
      this.roles = this.tokenService.getAuthorities();
    }
  }

  onLogin(): void {
      this.loginUsuario = new LoginUsuario (this.nombreUsuario, this.password, this.authService.login(this.loginUsuario).subscribe(
        
      ) )
  }

}
