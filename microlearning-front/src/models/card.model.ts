import { Course } from './course.model';

export interface Card {
  id: number;
  title: string;
  content: string;
  img: string;
  createdAt: string;
  course: Course;
}
