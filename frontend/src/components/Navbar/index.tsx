import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import "./styles.css";

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsrmovie-nav-content">
          <h1>DSRMovie</h1>
          <a href="https://github.com/dsrivan" target="_blank" rel="noreferrer">
            <div className="dsrmovie-contact-container">
              <GithubIcon />
              <p className="dsrmovie-contact-link">/dsrIvan</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
