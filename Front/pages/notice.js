import { Card, Icon, Image } from 'semantic-ui-react'
import SignIn from '../src/component/SignIn';
function notice({item}){
  return (
    
    <>
    <SignIn></SignIn>
    </>
    // <Card.Group>
    //   <style>
    //     {
    //       `
    //       #__next {
    //         background-color: #252839;
    //         align-content: center;
    //         display: flex;
    //         flex-direction: column;
    //         justify-content: center;
    //         min-height: 6em;
    //       }
    //       `
    //     }

    //   </style>
    // {item.map((data)=>{

    //   return(
    //      <Card key={data.id}>
    //        <Image src={data.thumbnailUrl} wrapped ui={false} />
    //        <Card.Content>
    //         <Card.Header>{data.title}</Card.Header>
    //         <Card.Meta>
    //           <span className='date'>Joined in 2015</span>
    //         </Card.Meta>
    //         <Card.Description>
    //           Matthew is a musician living in Nashville.
    //         </Card.Description>
    //       </Card.Content>
    //      </Card>
    //   )


    // })}
    // </Card.Group>
    
  )
}


export default notice;


export async function getServerSideProps(context) {
  const res = await fetch('https://jsonplaceholder.typicode.com/photos')
  const data = await res.json() 
  return {
    props: {
      item: data
    }, 
  }
}