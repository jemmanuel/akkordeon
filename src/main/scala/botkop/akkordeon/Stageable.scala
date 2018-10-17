package botkop.akkordeon

import akka.actor.{ActorRef, ActorSystem}

trait Stageable {
  def stage(implicit system: ActorSystem): ActorRef
}

object Stageable {
  def stage(ss: List[Stageable])(implicit system: ActorSystem): List[ActorRef] =
    ss.map(_.stage)
}
