import { ReactComponent as Arrow } from "assets/img/arrow.svg";
import "./styles.css";

function Pagination() {
  return (
    <div className="dsrmovie-pagination-container">
      <div className="dsrmovie-pagination-box">
        <button className="dsrmovie-pagination-button" disabled={true}>
          <Arrow />
        </button>
        <p>{`${1} de ${3}`}</p>
        <button className="dsrmovie-pagination-button" disabled={false}>
          <Arrow className="dsrmovie-flip-horizontal" />
        </button>
      </div>
    </div>
  );
}

export default Pagination;
