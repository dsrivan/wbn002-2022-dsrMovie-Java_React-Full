import MovieStars from "components/MovieStars";
import "./styles.css";

type Props = {
  score: number;
  count: number;
};

function MovieScore({ score, count }: Props) {
  return (
    <div className="dsrmovie-score-container">
      <p className="dsrmovie-score-value">
        {score > 0 ? score.toFixed(1) : "-"}
      </p>
      <MovieStars score={score} />
      <p className="dsrmovie-score-count">{count} avaliações</p>
    </div>
  );
}

export default MovieScore;
